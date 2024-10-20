package defpackage;

import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0820Gi {
    public final ViewOnKeyListenerC11859yi a;
    public final float b;
    public final TimeAnimator c;
    public float d;
    public int e;
    public volatile float f;
    public volatile float g;
    public volatile float h;
    public final int i;
    public boolean j;
    public int k;
    public final Rect l;
    public final int[] m;
    public final int n;
    public final int o;

    public C0820Gi(Context context, ViewOnKeyListenerC11859yi viewOnKeyListenerC11859yi, int i) {
        TimeAnimator timeAnimator = new TimeAnimator();
        this.c = timeAnimator;
        this.l = new Rect();
        this.m = new int[2];
        this.a = viewOnKeyListenerC11859yi;
        this.i = i;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.f28200_resource_name_obfuscated_res_0x7f080070);
        timeAnimator.setTimeListener(new TimeAnimator.TimeListener() { // from class: Fi
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator2, long j, long j2) {
                C0820Gi c0820Gi = C0820Gi.this;
                if (c0820Gi.a.l == null) {
                    return;
                }
                float f = (((float) j2) * 0.001f * c0820Gi.f) + c0820Gi.d;
                c0820Gi.d = f;
                int round = Math.round(f - c0820Gi.e);
                c0820Gi.e += round;
                c0820Gi.a.l.smoothScrollBy(round, 0);
                if (Float.isNaN(c0820Gi.g) || Float.isNaN(c0820Gi.h)) {
                    return;
                }
                c0820Gi.b(Math.round(c0820Gi.g), Math.round(c0820Gi.h), 0);
            }
        });
        this.n = (ViewConfiguration.getLongPressTimeout() + ViewConfiguration.getTapTimeout()) / 2;
        this.o = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final Rect a(View view) {
        Rect rect = this.l;
        view.getLocalVisibleRect(rect);
        int[] iArr = this.m;
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        return rect;
    }

    public final boolean b(int i, int i2, int i3) {
        boolean z;
        ViewOnKeyListenerC11859yi viewOnKeyListenerC11859yi = this.a;
        ListView listView = viewOnKeyListenerC11859yi.l;
        View childAt = listView.getChildAt(0);
        if (!(listView.getFirstVisiblePosition() != 0 || childAt == null || childAt.getTop() != 0 || a(childAt).bottom > this.k)) {
            return false;
        }
        ListView listView2 = viewOnKeyListenerC11859yi.l;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < listView2.getChildCount(); i4++) {
            if (listView2.getChildAt(i4) instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) listView2.getChildAt(i4);
                z = false;
                for (int i5 = 0; i5 < linearLayout.getChildCount(); i5++) {
                    arrayList.add(linearLayout.getChildAt(i5));
                    if (linearLayout.getChildAt(i5) instanceof ImageButton) {
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(listView2.getChildAt(i4));
            }
        }
        boolean z2 = false;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            View view = (View) arrayList.get(i6);
            boolean z3 = view.isEnabled() && view.isShown() && a(view).contains(i, i2);
            if (i3 == 0) {
                view.setPressed(z3);
            } else if (i3 != 1) {
                if (i3 == 2) {
                    view.setPressed(false);
                }
            } else if (z3) {
                FI2.a("MobileUsingMenuBySwButtonDragging");
                view.performClick();
                z2 = true;
            }
        }
        return z2;
    }
}
