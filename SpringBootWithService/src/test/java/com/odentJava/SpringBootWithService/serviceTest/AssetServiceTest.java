package com.odentJava.SpringBootWithService.serviceTest;

import com.odentJava.SpringBootWithService.model.Assets;
import com.odentJava.SpringBootWithService.repository.AssetRep;
import com.odentJava.SpringBootWithService.service.InventoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AssetServiceTest {

    @Mock
    private AssetRep assetRep;

    @InjectMocks
    private InventoryService assetService;

    private Assets testAsset;

    private Assets updateAsset;

    @BeforeEach
    void setUp(){
        testAsset = new Assets(201L,"Lenovooo","DevOps laptop","LENO123");
        updateAsset = new Assets(201L,"Lenov0","DevOps laptop","LEN1234");
    }
    //Get all assets
    @Test
    void getAllAssets_ShouldReturnAllAssets(){

        //Arrange
        List<Assets> expectedListOfAssets = Arrays.asList(
                testAsset,
                new Assets(202L,"Asus","Asus for developer","ASU4545")
        );
        when(assetRep.findAll()).thenReturn(expectedListOfAssets);

        //Act
        List<Assets> actualAsset = assetService.getAllAssets();

        //Assert
        assertEquals(expectedListOfAssets.size(),actualAsset.size());
        verify(assetRep).findAll();
    }

    @Test
    void getAssetById_ShouldReturnAssetById_WhenAssetIsExist(){
        //Arrange
        when(assetRep.findById(203L)).thenReturn(Optional.of(testAsset));

        //Act
        Optional<Assets> result = assetService.getAssetsById(203L);

        //Assert
        assertTrue(result.isPresent());
        assertEquals(testAsset.getName(),result.get().getName());
    }

    @Test
    void addAsset_ShouldReturnSaveAsset(){
        //Arrange
        when(assetRep.save(testAsset)).thenReturn(testAsset);

        //Act
        Assets saveAsset = assetService.addAssets(testAsset);

        //Assert
        assertNotNull(saveAsset);
        assertEquals(testAsset.getName(),saveAsset.getName());
        verify(assetRep).save(testAsset);
    }

    @Test
    void updateAsset_ShouldReturnUpdatedAssetWhenAssetExist(){
        //Arrange
        when(assetRep.existsById(1L)).thenReturn(true);

        when(assetRep.save(updateAsset)).thenReturn(updateAsset);


        //Act
        Assets result = assetService.updateAsset(1L, updateAsset);

        //Assert
        assertNotNull(result);
        assertEquals(updateAsset.getName(),result.getName());
        verify(assetRep).existsById(1L);
        verify(assetRep).save(updateAsset);
    }

    @Test
    void updateEmployee_ShouldReturnUpdatedEmployeeWhenAssetNotExist(){
        //Arrange
        when(assetRep.existsById(1L)).thenReturn(false);

//        when(employeeRep.save(updatedEmployee)).thenReturn(updatedEmployee);


        //Act
        Assets result = assetService.updateAsset(1L, updateAsset);

        //Assert
        assertNull(result);
//        assertEquals(updatedEmployee.getName(),result.getName());
        verify(assetRep).existsById(1L);
        verify(assetRep, never()).save(updateAsset);
    }

}
