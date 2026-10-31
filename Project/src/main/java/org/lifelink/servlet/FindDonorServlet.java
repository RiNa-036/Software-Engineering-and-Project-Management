package org.lifelink.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.lifelink.service.DonorService;
import java.io.IOException;

@WebServlet("/find-donors")
public class FindDonorServlet extends HttpServlet {
    private final DonorService donorService = new DonorService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String blood = request.getParameter("blood");
        String district = request.getParameter("district");
        request.setAttribute("donors", donorService.findPotentialDonors(blood, district));
        request.getRequestDispatcher("/find-results.jsp").forward(request, response);
    }
}
