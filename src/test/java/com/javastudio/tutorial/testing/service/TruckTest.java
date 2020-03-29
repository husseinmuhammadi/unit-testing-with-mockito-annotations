package com.javastudio.tutorial.testing.service;

import com.javastudio.tutorial.testing.api.Engine;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TruckTest {
    private Logger logger = Logger.getLogger(TruckTest.class.getName());

    @Mock
    Engine mockEngine;

    @Test
    void truckStartingWithMockEngine() {
        logger.info("Testing truck starting");
        when(mockEngine.isStart()).thenReturn(true);
        Truck truck = new Truck(mockEngine);
        assertTrue(truck.isStart());
    }
}