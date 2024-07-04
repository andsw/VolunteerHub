package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.entity.Organization;
import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

  private final OrganizationService organizationService;

  @Autowired
  public OrganizationController(OrganizationService organizationService) {
    this.organizationService = organizationService;
  }

  @GetMapping("/{id}")
  public Result<Organization> getOrganization(@PathVariable Integer id) {
    Organization organization = organizationService.getOrganizationById(id);
    if (organization == null) {
      return Result.error("Organization not found for ID: " + id);
    }
    return Result.success(organization);
  }

  @GetMapping("/")
  public Result<List<Organization>> getAllOrganizations() {
    List<Organization> organizations = organizationService.getAllOrganizations();
    return Result.success(organizations);
  }

  @PostMapping("/")
  public Result<Void> createOrganization(@RequestBody Organization organization) {
    organizationService.saveOrganization(organization);
    return Result.success();
  }

  @PutMapping("/{id}")
  public Result<Void> updateOrganization(@PathVariable Integer id, @RequestBody Organization organization) {
    organization.setId(id);
    organizationService.updateOrganization(organization);
    return Result.success();
  }

  @DeleteMapping("/{id}")
  public Result<Void> deleteOrganization(@PathVariable Integer id) {
    organizationService.deleteOrganization(id);
    return Result.success();
  }
}
