package mahimna.honey.practicum13.historyservice.controllers;


@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesHistoryController {
    
    private final PrimesHistoryRepository primesHistoryRepository;
    
    public PrimesHistoryController(
        PrimesHistoryRepository primesHistoryRepository) { 
        this.primesHistoryRepository = primesHistoryRepository;
}

@GetMapping("/{customer}")
public List<Primes Record> findAll(@PathVariable String customer) { 
    return primesHistoryRepository.findAllByCustomer (customer);
}
}