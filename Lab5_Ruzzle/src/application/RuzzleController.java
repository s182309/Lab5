package application;

import java.awt.Insets;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import it.polito.tdp.ruzzle.model.Parola;
import it.polito.tdp.ruzzle.model.Quadrato;
import it.polito.tdp.ruzzle.model.RuzzleModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class RuzzleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextFlow t0;

    @FXML
    private TextFlow t1;

    @FXML
    private TextFlow t2;

    @FXML
    private TextFlow t3;

    @FXML
    private TextFlow t4;

    @FXML
    private TextFlow t5;

    @FXML
    private TextFlow t6;

    @FXML
    private TextFlow t7;

    @FXML
    private TextFlow t8;

    @FXML
    private TextFlow t9;

    @FXML
    private TextFlow t10;

    @FXML
    private TextFlow t11;

    @FXML
    private TextFlow t12;

    @FXML
    private TextFlow t13;

    @FXML
    private TextFlow t14;

    @FXML
    private TextFlow t15;
    
    private GridPane gridPane;

    @FXML
    private ListView<String> listView;
    
    private RuzzleModel model;
    
    public void setModel(RuzzleModel model){
    	this.model = model ;
    }

    @FXML
    void doGenera(ActionEvent event) {
    	Quadrato q = new Quadrato (4);
    	
    	
    	
    	//Map <Parola , String> grid =  model.genera(q);

    }

    @FXML
    void initialize() {
        assert t0 != null : "fx:id=\"t0\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t1 != null : "fx:id=\"t1\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t2 != null : "fx:id=\"t2\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t3 != null : "fx:id=\"t3\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t4 != null : "fx:id=\"t4\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t5 != null : "fx:id=\"t5\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t6 != null : "fx:id=\"t6\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t7 != null : "fx:id=\"t7\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t8 != null : "fx:id=\"t8\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t9 != null : "fx:id=\"t9\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t10 != null : "fx:id=\"t10\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t11 != null : "fx:id=\"t11\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t12 != null : "fx:id=\"t12\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t13 != null : "fx:id=\"t13\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t14 != null : "fx:id=\"t14\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert t15 != null : "fx:id=\"t15\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert listView != null : "fx:id=\"listView\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        t0.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t1.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t2.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t3.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t4.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t5.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t6.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t7.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t8.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t9.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t10.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t11.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t12.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t13.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t14.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        t15.setBackground( new Background(new BackgroundFill(Color.GREEN, null, null)) );
        

    }
}

