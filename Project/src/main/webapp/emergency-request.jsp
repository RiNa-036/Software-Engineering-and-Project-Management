<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html><html lang="en"><head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1"><title>Emergency Request | LifeLink</title><link rel="stylesheet" href="css/style.css"></head><body>
<%@ include file="partials/nav.jspf" %><main class="page wrap"><div class="page-heading"><span class="eyebrow">URGENT BLOOD REQUIREMENT</span><h1>Create an emergency <em>request.</em></h1><p>Enter the basic details that a future version of LifeLink would collect.</p></div>
<div class="demo-alert">Prototype only: this form does not alert donors, hospitals, or emergency services. Do not enter real patient information.</div>
<form class="form-panel" action="submit-request" method="post"><div class="form-grid">
<label>Required blood group<select name="bloodGroup" required><option value="">Select blood group</option><option>A+</option><option>A-</option><option>B+</option><option>B-</option><option>AB+</option><option>AB-</option><option>O+</option><option>O-</option></select></label>
<label>Units required<input name="units" type="number" min="1" max="10" required placeholder="e.g. 2"></label>
<label>District<input name="district" required maxlength="50" placeholder="e.g. Tangail"></label>
<label>Hospital / medical facility<input name="hospital" required maxlength="100" placeholder="Facility name"></label>
<label>Required date<input name="requiredDate" type="date" required></label>
<label>Requester name<input name="requesterName" required maxlength="70" placeholder="Sample requester name"></label></div>
<label class="check"><input type="checkbox" required> I understand this is a demonstration and no real request will be sent.</label>
<button class="btn primary" type="submit">Submit demo request</button></form>
<div class="safety-box"><b>In a real emergency</b><p>Contact the treating hospital or an authorized blood bank directly. LifeLink is only a student prototype and is not an emergency response service.</p></div></main><footer><div class="wrap footer-inner"><b>Life<span>Link</span></b><small>Student project prototype</small></div></footer>
</body></html>
