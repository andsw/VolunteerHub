package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.Organization;

import java.util.List;

public interface OrganizationService {
  Organization getOrganizationById(Integer id);
  List<Organization> getAllOrganizations();
  void saveOrganization(Organization organization);
  void updateOrganization(Organization organization);
  void deleteOrganization(Integer id);
}
