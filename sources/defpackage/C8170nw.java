package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8170nw extends AbstractC2218Rb3 {
    public final ArrayList a;
    public final C3290Zi0 g;
    public Runnable h;

    public C8170nw(View view) {
        super(view.getContext());
        C3290Zi0 c3290Zi0 = new C3290Zi0(getContext());
        this.g = c3290Zi0;
        C2088Qb3 c2088Qb3 = new C2088Qb3(-2, -2);
        c2088Qb3.a = true;
        c3290Zi0.setLayoutParams(c2088Qb3);
        addView(c3290Zi0);
        this.a = new ArrayList();
        if (c3290Zi0.g != null) {
            c3290Zi0.removeView(view);
        }
        c3290Zi0.g = view;
        C2088Qb3 c2088Qb32 = new C2088Qb3(-2, -2);
        c2088Qb32.a = true;
        view.setLayoutParams(c2088Qb32);
        c3290Zi0.addView(c3290Zi0.g);
    }

    public C8170nw(Context context, int i) {
        this(LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = getLayoutDirection() == 1;
        if ((!z && AbstractC7472lu1.d(keyEvent)) || (z && AbstractC7472lu1.c(keyEvent))) {
            ArrayList arrayList = this.a;
            if (arrayList.size() == 1) {
                ((ImageView) arrayList.get(0)).callOnClick();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        Runnable runnable;
        this.g.setSelected(z);
        if (!z || (runnable = this.h) == null) {
            return;
        }
        runnable.run();
    }
}
