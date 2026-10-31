<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html><html lang="en"><head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1"><title>Request Result | LifeLink</title><link rel="stylesheet" href="css/style.css"></head><body><%@ include file="partials/nav.jspf" %><main class="page wrap">
<div class="page-heading"><span class="eyebrow">REQUEST STATUS</span><h1>Demo request <em>result.</em></h1></div>
<div class="safety-box"><b><%= request.getAttribute("successMessage") != null ? "Submitted" : "Not submitted" %></b><p><%= request.getAttribute("successMessage") != null ? request.getAttribute("successMessage") : request.getAttribute("errorMessage") %></p></div>
<a class="btn primary" href="emergency-request.jsp">Create another demo request</a></main><footer><div class="wrap footer-inner"><b>Life<span>Link</span></b><small>Student project prototype</small></div></footer></body></html>
