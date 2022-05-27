package taxi.service.check.relation;

public interface CheckRelationService {
    boolean validId(Long carId, Long driverId);
}
