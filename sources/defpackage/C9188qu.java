package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qu */
/* loaded from: classes.dex */
public final class C9188qu extends LinearLayout {
    public final C8236o71 a;
    public final RecyclerView g;
    public final C8502ou h;
    public int i;

    public C9188qu(Context context, C4617dc3 c4617dc3) {
        super(context);
        setClickable(false);
        setFocusable(false);
        setOrientation(1);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08061b);
        setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize);
        C8236o71 c8236o71 = new C8236o71(context);
        this.a = c8236o71;
        c8236o71.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c8236o71.g.setVisibility(8);
        c8236o71.setClickable(false);
        c8236o71.setFocusable(false);
        c8236o71.setVisibility(8);
        addView(c8236o71);
        RecyclerView recyclerView = new RecyclerView(context, null);
        this.g = recyclerView;
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setFocusable(true);
        recyclerView.setFocusableInTouchMode(true);
        recyclerView.p0(null);
        recyclerView.q0(new LinearLayoutManager(0, false));
        C8502ou c8502ou = new C8502ou(recyclerView.s);
        this.h = c8502ou;
        recyclerView.h(c8502ou);
        recyclerView.g(new C8845pu(this));
        recyclerView.n0(c4617dc3);
        addView(recyclerView);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        int C;
        boolean z = getLayoutDirection() == 1;
        C8502ou c8502ou = this.h;
        if ((!z && AbstractC7472lu1.d(keyEvent)) || (z && AbstractC7472lu1.c(keyEvent))) {
            AbstractC12077zK2 abstractC12077zK2 = c8502ou.g;
            if (abstractC12077zK2 != null) {
                int i3 = c8502ou.a;
                if (i3 == -1) {
                    C = 0;
                } else if (i3 < abstractC12077zK2.C()) {
                    C = c8502ou.a + 1;
                } else {
                    C = abstractC12077zK2.C() - 1;
                }
                c8502ou.a(C, false);
            }
            return true;
        }
        if ((z && AbstractC7472lu1.d(keyEvent)) || (!z && AbstractC7472lu1.c(keyEvent))) {
            AbstractC12077zK2 abstractC12077zK22 = c8502ou.g;
            if (abstractC12077zK22 != null) {
                int i4 = c8502ou.a;
                if (i4 == -1) {
                    i2 = abstractC12077zK22.C() - 1;
                } else {
                    i2 = i4 > 0 ? i4 - 1 : 0;
                }
                c8502ou.a(i2, false);
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        C8502ou c8502ou = this.h;
        if (z) {
            c8502ou.a(0, true);
        } else {
            c8502ou.a(-1, false);
        }
    }
}
