package com.jcnetwork.codershigh;

import android.app.Activity;
import android.os.Bundle;


import com.jcnetwork.codershigh.fragment.FragmentDisplay;
import com.jcnetwork.codershigh.fragment.FragmentInputDec;
import com.jcnetwork.codershigh.fragment.FragmentInputHex;

public class ActivityMain extends Activity{

    private FragmentDisplay     _fgDisplay;
    private FragmentInputDec    _fgInputDec;
    private FragmentInputHex    _fgInputHex;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _initWork();
    }


    /**
     * 交换输入区
     */
    public void exchange(){

        if(_fgInputHex.isVisible()){
            _fgInputHex.hideFg();
            _fgInputDec.showFg();
        }else if(_fgInputDec.isVisible()){
            _fgInputDec.hideFg();
            _fgInputHex.showFg();
        }
    }




    private void _initWork(){

        _fgDisplay = new FragmentDisplay();
        _fgDisplay.replaceFg(this, R.id.field_display);

        _fgInputDec = new FragmentInputDec(_fgDisplay);
        _fgInputDec.addFg(this, R.id.field_input);
        _fgInputDec.hideFg();

        _fgInputHex = new FragmentInputHex(_fgDisplay);
        _fgInputHex.addFg(this, R.id.field_input);
    }
}

