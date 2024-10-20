package defpackage;

import android.view.View;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1594Mh extends d implements View.OnClickListener {
    public ViewOnClickListenerC1594Mh(View view) {
        super(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1465Lh c1465Lh = (C1465Lh) this.x;
        c1465Lh.l = true;
        ArrayList arrayList = c1465Lh.i;
        c1465Lh.a.f(arrayList.size(), 1);
        c1465Lh.y(arrayList.size(), c1465Lh.j.size() + 1);
    }
}
