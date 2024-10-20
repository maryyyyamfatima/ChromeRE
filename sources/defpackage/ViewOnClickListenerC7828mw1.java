package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC7828mw1 extends d implements View.OnClickListener {
    public final TextView A;
    public final CheckBox B;
    public final ImageView C;
    public String D;
    public HashSet E;
    public final TextView z;

    public ViewOnClickListenerC7828mw1(View view) {
        super(view);
        view.setOnClickListener(this);
        this.z = (TextView) view.findViewById(R.id.ui_language_representation);
        this.A = (TextView) view.findViewById(R.id.native_language_representation);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.language_ask_checkbox);
        this.B = checkBox;
        this.C = (ImageView) view.findViewById(R.id.device_language_icon);
        checkBox.setOnCheckedChangeListener(new C7484lw1(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.B.setChecked(!r2.isChecked());
    }
}
