package defpackage;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1335Kh extends d implements View.OnClickListener {
    public final TextView A;
    public final RadioButton B;
    public final TextView z;

    public ViewOnClickListenerC1335Kh(View view) {
        super(view);
        this.z = (TextView) view.findViewById(R.id.primary_language_name);
        this.A = (TextView) view.findViewById(R.id.secondary_language_name);
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.app_language_prompt_radiobutton);
        this.B = radioButton;
        view.setOnClickListener(this);
        radioButton.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1465Lh c1465Lh = (C1465Lh) this.x;
        int g = g();
        if (g == -1) {
            return;
        }
        c1465Lh.k = c1465Lh.M(g);
        c1465Lh.t();
        View findViewById = view.getRootView().findViewById(R.id.positive_button);
        if (findViewById != null) {
            findViewById.sendAccessibilityEvent(8);
        }
    }
}
