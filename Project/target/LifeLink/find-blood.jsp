<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html><html lang="en"><head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1"><title>Find Blood | LifeLink</title><link rel="stylesheet" href="css/style.css"></head><body>
<%@ include file="partials/nav.jspf" %><main class="page wrap"><div class="page-heading"><span class="eyebrow">DONOR DISCOVERY</span><h1>Find potential <em>donors.</em></h1><p>Filter the demonstration records by blood group and district.</p></div>
<div class="demo-alert">Demo mode: profiles are fictional sample records, not real donors. They cannot be contacted.</div>
<form class="search-panel" action="find-donors" method="get">
<label>Blood group<select name="blood"><option value="">All blood groups</option><option>A+</option><option>A-</option><option>B+</option><option>B-</option><option>AB+</option><option>AB-</option><option>O+</option><option>O-</option></select></label>
<label>District<select name="district"><option value="">All districts</option><option>Tangail</option><option>Dhaka</option><option>Mymensingh</option><option>Jamalpur</option></select></label>
<button class="btn primary" type="submit">Search donors</button></form>
<div class="safety-box"><b>Important medical note</b><p>Search results only identify potential contacts. Donor eligibility, blood grouping, screening and crossmatching must be confirmed by qualified professionals at an authorized hospital or blood bank.</p></div></main>
<footer><div class="wrap footer-inner"><b>Life<span>Link</span></b><small>Student project prototype</small></div></footer></body></html>
