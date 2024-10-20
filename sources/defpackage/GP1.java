package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.app.a;
import androidx.mediarouter.app.c;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GP1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d g;

    public GP1(d dVar, boolean z) {
        this.g = dVar;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        d dVar = this.g;
        dVar.x.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (dVar.j0) {
            dVar.k0 = true;
            return;
        }
        int i2 = dVar.E.getLayoutParams().height;
        d.l(dVar.E, -1);
        dVar.r(dVar.g());
        View decorView = dVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWindow().getAttributes().width, 1073741824), 0);
        d.l(dVar.E, i2);
        if (!(dVar.y.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dVar.y.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width >= height) {
                i = (int) (((dVar.q * height) / width) + 0.5f);
            } else {
                i = (int) (((dVar.q * 9.0f) / 16.0f) + 0.5f);
            }
            dVar.y.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int j = dVar.j(dVar.g());
        int size = dVar.K.size();
        boolean k = dVar.k();
        DQ1 dq1 = dVar.m;
        int size2 = k ? dq1.a().size() * dVar.S : 0;
        if (size > 0) {
            size2 += dVar.U;
        }
        int min = Math.min(size2, dVar.T);
        if (!dVar.i0) {
            min = 0;
        }
        int max = Math.max(i, min) + j;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height2 = rect.height() - (dVar.w.getMeasuredHeight() - dVar.x.getMeasuredHeight());
        if (i > 0 && max <= height2) {
            dVar.y.setVisibility(0);
            d.l(dVar.y, i);
        } else {
            if (dVar.E.getMeasuredHeight() + dVar.I.getLayoutParams().height >= dVar.x.getMeasuredHeight()) {
                dVar.y.setVisibility(8);
            }
            max = min + j;
            i = 0;
        }
        if (dVar.g() && max <= height2) {
            dVar.F.setVisibility(0);
        } else {
            dVar.F.setVisibility(8);
        }
        dVar.r(dVar.F.getVisibility() == 0);
        int j2 = dVar.j(dVar.F.getVisibility() == 0);
        int max2 = Math.max(i, min) + j2;
        if (max2 > height2) {
            min -= max2 - height2;
        } else {
            height2 = max2;
        }
        dVar.E.clearAnimation();
        dVar.I.clearAnimation();
        dVar.x.clearAnimation();
        boolean z = this.a;
        if (z) {
            dVar.f(dVar.E, j2);
            dVar.f(dVar.I, min);
            dVar.f(dVar.x, height2);
        } else {
            d.l(dVar.E, j2);
            d.l(dVar.I, min);
            d.l(dVar.x, height2);
        }
        d.l(dVar.v, rect.height());
        List a = dq1.a();
        if (!a.isEmpty()) {
            if (new HashSet(dVar.K).equals(new HashSet(a))) {
                dVar.f11486J.notifyDataSetChanged();
                return;
            }
            if (z) {
                OverlayListView overlayListView = dVar.I;
                c cVar = dVar.f11486J;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                    Object item = cVar.getItem(firstVisiblePosition + i3);
                    View childAt = overlayListView.getChildAt(i3);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z) {
                OverlayListView overlayListView2 = dVar.I;
                c cVar2 = dVar.f11486J;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                    Object item2 = cVar2.getItem(firstVisiblePosition2 + i4);
                    View childAt2 = overlayListView2.getChildAt(i4);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(dVar.n.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            ArrayList arrayList = dVar.K;
            HashSet hashSet = new HashSet(a);
            hashSet.removeAll(arrayList);
            dVar.L = hashSet;
            HashSet hashSet2 = new HashSet(dVar.K);
            hashSet2.removeAll(a);
            dVar.M = hashSet2;
            dVar.K.addAll(0, dVar.L);
            dVar.K.removeAll(dVar.M);
            dVar.f11486J.notifyDataSetChanged();
            if (z && dVar.i0) {
                if (dVar.M.size() + dVar.L.size() > 0) {
                    dVar.I.setEnabled(false);
                    dVar.I.requestLayout();
                    dVar.j0 = true;
                    dVar.I.getViewTreeObserver().addOnGlobalLayoutListener(new a(dVar, hashMap, hashMap2));
                    return;
                }
            }
            dVar.L = null;
            dVar.M = null;
            return;
        }
        dVar.K.clear();
        dVar.f11486J.notifyDataSetChanged();
    }
}
