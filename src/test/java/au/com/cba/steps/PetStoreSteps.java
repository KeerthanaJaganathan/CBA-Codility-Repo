package au.com.cba.steps;

import au.com.cba.Page.PetSorePage;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetStoreSteps extends BaseSteps {

    private Response response = null;
    private RequestSpecification request;

    @Given("^User needs to find the pet by pet \"([^\"]*)\"$")
    public void userNeedsToFindThePetByPet(String petId) throws Throwable {
        PetSorePage.FindPetByPetID(petId);

    }

    @Given("^User needs to find the pet by status \"([^\"]*)\"$")
    public void userNeedsToFindThePetByStatus(String status) throws Throwable {
        PetSorePage.FindPetByPetStatus(status);
    }

    @Given("^User needs to delete the pet by pet \"([^\"]*)\"$")
    public void userNeedsToDeleteThePetByPet(String id) throws Throwable {
        PetSorePage.DeletePetByPetID(id);
    }

    @Given("^User needs to add the pet by \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void userNeedsToAddThePetByAnd(String id, String name, String photoUrls, String status) throws Throwable {
        PetSorePage.AddPet(id,name,photoUrls,status);
    }
}
