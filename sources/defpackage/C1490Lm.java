package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1490Lm extends d {
    public final TextView A;
    public final ImageView B;
    public final RadioButton C;
    public final /* synthetic */ C1619Mm D;
    public final TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1490Lm(C1619Mm c1619Mm, View view, final C2009Pm c2009Pm) {
        super(view);
        this.D = c1619Mm;
        this.z = (TextView) view.findViewById(R.id.authenticator_option_title);
        this.A = (TextView) view.findViewById(R.id.authenticator_option_description);
        this.B = (ImageView) view.findViewById(R.id.authenticator_option_icon);
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.authenticator_option_radio_btn);
        this.C = radioButton;
        radioButton.setOnClickListener(new View.OnClickListener() { // from class: Km
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1490Lm c1490Lm = C1490Lm.this;
                C1619Mm c1619Mm2 = c1490Lm.D;
                int i = c1619Mm2.l;
                c1619Mm2.l = c1490Lm.g();
                c1619Mm2.v(i);
                c1619Mm2.v(c1619Mm2.l);
                c2009Pm.i = (C1230Jm) c1619Mm2.i.get(c1619Mm2.l);
            }
        });
    }
}
