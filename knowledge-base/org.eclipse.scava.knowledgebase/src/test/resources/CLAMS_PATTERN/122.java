{
    StatefulKnowledgeSession ksession;
    ksession.getWorkItemManager().registerWorkItemHandler( " a string " , new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler( " a string " , new SystemOutWorkItemHandler());
    ProcessInstance processInstance = ksession.startProcess( " a string " );
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler( " a string " , new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler( " a string " , new SystemOutWorkItemHandler());
    ksession.signalEvent( " a string " ,  " a string " , processInstance.getId());
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
    processInstance = ksession.startProcess( " a string " );
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler( " a string " , new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler( " a string " , new SystemOutWorkItemHandler());
    ksession.signalEvent( " a string " ,  " a string " , processInstance.getId());
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
}    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ProcessInstance processInstance = ksession.startProcess( "  " a string "  " );    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ksession.signalEvent( "  " a string "  " ,  "  " a string "  " , processInstance.getId());    processInstance = ksession.startProcess( "  " a string "  " );    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ksession.signalEvent( "  " a string "  " ,  "  " a string "  " , processInstance.getId());    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ProcessInstance processInstance = ksession.startProcess( "  " a string "  " );    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ksession.signalEvent( "  " a string "  " ,  "  " a string "  " , processInstance.getId());    processInstance = ksession.startProcess( "  " a string "  " );    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ksession.getWorkItemManager().registerWorkItemHandler( "  " a string "  " , new SystemOutWorkItemHandler());    ksession.signalEvent( "  " a string "  " ,  "  " a string "  " , processInstance.getId());}    ksession.getWorkItemManager().registerWorkItemHandler( "  "  " a string "  "  " , new SystemOutWorkItemHandler());    ksession.getWorkItemManager().registerWorkItemHandler( "  "  " a string "  "  " , new SystemOutWorkItemHandler());    ProcessInstance processInstance = ksession.startProcess( "  "  " a string "  "  " );    ksession.getWorkItemManager().registerWorkItemHandler( "  "  " a string "  "  " , new SystemOutWorkItemHandler());    ksession.getWorkItemManager().registerWorkItemHandler( "  "  " a string "  "  " , new SystemOutWorkItemHandler());    ksession.signalEvent( "  "  " a string "  "  " ,  "  "  " a string "  "  " , processInstance.getId());    processInstance = ksession.startProcess( "  "  " a string "  "  " );    ksession.getWorkItemManager().registerWorkItemHandler( "  "  " a string "  "  " , new SystemOutWorkItemHandler());    ksession.getWorkItemManager().registerWorkItemHandler( "  "  " a string "  "  " , new SystemOutWorkItemHandler());    ksession.signalEvent( "  "  " a string "  "  " ,  "  "  " a string "  "  " , processInstance.getId());
