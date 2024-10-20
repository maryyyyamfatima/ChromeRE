package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import defpackage.C11758yP1;
import defpackage.C7727mf2;
import defpackage.DQ1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map g;
    public final /* synthetic */ d h;

    public a(d dVar, HashMap hashMap, HashMap hashMap2) {
        this.h = dVar;
        this.a = hashMap;
        this.g = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        C7727mf2 c7727mf2;
        int i;
        Map map3;
        d dVar = this.h;
        dVar.I.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dVar.L;
        if (hashSet == null || dVar.M == null) {
            return;
        }
        int size = hashSet.size() - dVar.M.size();
        b bVar = new b(dVar);
        int firstVisiblePosition = dVar.I.getFirstVisiblePosition();
        int i2 = 0;
        boolean z = false;
        while (true) {
            int childCount = dVar.I.getChildCount();
            map = this.a;
            map2 = this.g;
            if (i2 >= childCount) {
                break;
            }
            View childAt = dVar.I.getChildAt(i2);
            DQ1 dq1 = (DQ1) dVar.f11486J.getItem(firstVisiblePosition + i2);
            Rect rect = (Rect) map.get(dq1);
            int top = childAt.getTop();
            if (rect != null) {
                i = rect.top;
            } else {
                i = (dVar.S * size) + top;
            }
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = dVar.L;
            if (hashSet2 == null || !hashSet2.contains(dq1)) {
                map3 = map;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                map3 = map;
                alphaAnimation.setDuration(dVar.m0);
                animationSet.addAnimation(alphaAnimation);
                i = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i - top, 0.0f);
            translateAnimation.setDuration(dVar.l0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(dVar.o0);
            if (!z) {
                animationSet.setAnimationListener(bVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map3.remove(dq1);
            map2.remove(dq1);
            i2++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            DQ1 dq12 = (DQ1) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(dq12);
            if (dVar.M.contains(dq12)) {
                c7727mf2 = new C7727mf2(bitmapDrawable, rect2);
                c7727mf2.h = 1.0f;
                c7727mf2.i = 0.0f;
                c7727mf2.e = dVar.n0;
                c7727mf2.d = dVar.o0;
            } else {
                int i3 = dVar.S * size;
                C7727mf2 c7727mf22 = new C7727mf2(bitmapDrawable, rect2);
                c7727mf22.g = i3;
                c7727mf22.e = dVar.l0;
                c7727mf22.d = dVar.o0;
                c7727mf22.m = new C11758yP1(dVar, dq12);
                dVar.N.add(dq12);
                c7727mf2 = c7727mf22;
            }
            dVar.I.a.add(c7727mf2);
        }
    }
}
