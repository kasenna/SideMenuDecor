package karpen74us.sidemenudecorexample;
/*
MainActivity.java
Copyright (C) 2016  Max Karpenkov

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import karpen74us.sidemenudecor.RippleButton;
import karpen74us.sidemenudecor.RippleImageButton;


public class MainActivity extends AppCompatActivity {

    RippleButton mRippleButton;
    RippleImageButton mRippleImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mRippleButton = (RippleButton) findViewById(R.id.ripple_button);
        mRippleButton.setRippleColor(Color.parseColor("#aaaaaa"));
        mRippleButton.setRippleDuration(150);
        mRippleButton.setEnabled(true);
        mRippleButton.setClickable(true);
        mRippleButton.setLongClickable(true);
        mRippleButton.setRippleThenClick(true);
        mRippleImageButton = (RippleImageButton) findViewById(R.id.ripple_image_button);
        mRippleImageButton.setRippleColor(Color.parseColor("#aaaaaa"));
        mRippleImageButton.setRippleDuration(150);
        mRippleImageButton.setEnabled(true);
        mRippleImageButton.setClickable(true);
        mRippleImageButton.setLongClickable(true);
        mRippleImageButton.setRippleThenClick(true);
        mRippleImageButton.setImageResource(R.drawable.voicmail);
    }

}
