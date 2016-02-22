This is JAX-WS contract first WebSerivice imlementaion for Mitchell Coding challenge, I have used cxf-architype is maven to create the folder structure. 

To build the project use "Maven Install", I have used to tomcat8 to deploy the service during dev,
the servie will be accessible at "http://localhost:8080/claim-ws/MitchellServices/ClaimWs?wsdl" 
once it is sucessfully built and deployed. All the dependencies are managed trough Maven.

I have implemented the below 4 tasks from the challenge as endpoints to the service.
1.Create a claim and persist it to a backing store. The input to the create request should be a MitchellClaim XML.
2.Read a claim from the backing store.
3.Find a list of claims in the backing store by date range of the LossDate.
4.[optional] Update a claim in the backing store. The input to the update request should be a MitchellClaim XML. Only the fields provided in the input should be updated.

