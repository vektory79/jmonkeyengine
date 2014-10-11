/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jme3test.material;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.material.MaterialDef;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;

/**
 *
 * @author Jan
 */
public class TestTessellation extends SimpleApplication {
  
  public static void main(String[] args){
    TestTessellation app = new TestTessellation();
    app.start();
    
  }

  @Override
  public void simpleInitApp() {
    Sphere box = new Sphere(3, 4, 1f);
    box.setMode(Mesh.Mode.Patches);
    Geometry boxGeom = new Geometry("Box", box);
    MaterialDef matDef = (MaterialDef) assetManager.loadAsset("Common/MatDefs/Misc/PhongTessellation.j3md");
    Material mat = new Material(matDef);
//    Material mat = assetManager.loadMaterial("Common/Materials/RedColor.j3m");
    boxGeom.setMaterial(mat);
    rootNode.attachChild(boxGeom);
    rootNode.addLight(new DirectionalLight());
    flyCam.setMoveSpeed(20f);
    
  }
  
}
