package org.lifelink.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.lifelink.model.BloodRequest;
import org.lifelink.service.RequestService;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/submit-request")
public class RequestServlet extends HttpServlet {
    private final RequestService requestService = new RequestService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            BloodRequest item = new BloodRequest(
                1, request.getParameter("requesterName"), request.getParameter("bloodGroup"),
                Integer.parseInt(request.getParameter("units")), request.getParameter("district"),
                request.getParameter("hospital"), LocalDate.parse(request.getParameter("requiredDate"))
            );
            requestService.create(item);
            request.setAttribute("successMessage", "Demo request accepted in memory. It has not been sent to a hospital or donor.");
        } catch (Exception ex) {
            request.setAttribute("errorMessage", "Please check the form and enter valid values.");
        }
        request.getRequestDispatcher("/request-result.jsp").forward(request, response);
    }
}
