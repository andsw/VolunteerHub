package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionListItem;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionVO;
import ca.ontario.conestoga.volunteer_hub.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController {
  private final PositionService positionService;

  @Autowired
  public PositionController(PositionService positionService) {
    this.positionService = positionService;
  }

  @GetMapping
  public Result<List<PositionListItem>> listPositions(@RequestParam(required = false) Integer orgId) {
    return Result.success(positionService.getPositionListByOrgId(orgId));
  }

  @GetMapping("/{id}/detail")
  public Result<PositionVO> positionDetail(@PathVariable Integer id) {
    return Result.success(positionService.getPositionDetailById(id));
  }
}
