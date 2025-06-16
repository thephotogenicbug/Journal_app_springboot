//package com.naveen.journalApp.controller;
//
//import com.naveen.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal")
//public class JournalEntryController {
//
//    private Map<String, JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){ // localhost:8080/journal GET
//      return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){ // localhost:8080/journal POST
//
//        journalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId){
//        return journalEntries.get(myId);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
//        return journalEntries.remove(myId);
//    }
//
//    @PutMapping("/id/{id}")
//    public JournalEntry updateJournalById(@PathVariable String id, @RequestBody JournalEntry myEntry){
//       return journalEntries.put(id,myEntry);
//    }
//
//
//}
