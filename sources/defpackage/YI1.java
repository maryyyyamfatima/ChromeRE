package defpackage;

import J.N;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YI1 implements PI1, InterfaceC2060Pw0, View.OnTouchListener, DialogInterface.OnShowListener {
    public Dialog a;
    public Runnable g;
    public View h;
    public ScrollView i;
    public View j;
    public View k;
    public View l;
    public View m;
    public View n;
    public ImageView o;
    public final Activity p;
    public final C6201iC0 q;
    public Bitmap r;
    public final float s;
    public int t;
    public int u;
    public boolean v;
    public final int w;

    @Override // defpackage.PI1
    public final void a(int i) {
    }

    public YI1(Activity activity, C6201iC0 c6201iC0) {
        this.p = activity;
        this.q = c6201iC0;
        this.s = activity.getResources().getDisplayMetrics().density;
        C7928nE c7928nE = UN.a;
        this.w = N.M37SqSAy("ChromeShareLongScreenshot", "autoscroll", 0);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        layoutParams.height = this.j.getHeight() + (this.r.getHeight() - this.i.getHeight());
        this.k.setLayoutParams(layoutParams);
    }

    public final int d(int i) {
        return (int) ((i * this.s) + 0.5f);
    }

    @Override // defpackage.InterfaceC2060Pw0
    public final Bitmap b() {
        int height = this.j.getHeight();
        int height2 = ((View) this.k.getParent()).getHeight() - this.k.getHeight();
        int i = ((ViewGroup.MarginLayoutParams) this.o.getLayoutParams()).topMargin;
        int i2 = height - i;
        int i3 = height2 - i;
        int width = this.r.getWidth();
        int width2 = this.o.getWidth();
        if (width > width2) {
            float f = (width * 1.0f) / width2;
            i2 = (int) (i2 * f);
            i3 = (int) (i3 * f);
        }
        int max = Math.max(i2, 0);
        int min = Math.min(i3, this.r.getHeight() - 1);
        if (min <= max) {
            return null;
        }
        Bitmap bitmap = this.r;
        int i4 = min - max;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, max, bitmap.getWidth(), i4);
        this.r = null;
        AbstractC10254u04.a.c(i4, 1, 100000, 50, "Sharing.LongScreenshots.BitmapSelectedHeight");
        return createBitmap;
    }

    public final void e(boolean z) {
        View view = z ? this.j : this.k;
        int height = view.getHeight();
        int d = d(20);
        if (height <= d) {
            ZN3.b(z ? R.string.f86680_resource_name_obfuscated_res_0x7f140a36 : R.string.f86670_resource_name_obfuscated_res_0x7f140a35, 1, this.p).d();
            return;
        }
        int max = Math.max(d, height - d(100));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = max;
        view.setLayoutParams(layoutParams);
        this.i.smoothScrollBy(0, (max - height) * (z ? 1 : -1));
    }

    @Override // defpackage.InterfaceC2060Pw0
    public final void c(Runnable runnable) {
        this.g = runnable;
        this.q.a(new XI1(this));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        boolean z = view == this.m;
        View view2 = z ? this.j : this.k;
        int rawY = (int) motionEvent.getRawY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            this.t = rawY;
            this.u = layoutParams.height;
            this.v = true;
            this.i.requestDisallowInterceptTouchEvent(true);
        } else {
            if (actionMasked == 1) {
                if (!this.v) {
                    return false;
                }
                (z ? this.m : this.n).performClick();
                this.v = false;
                return false;
            }
            if (actionMasked != 2) {
                return false;
            }
            this.l.setVisibility(4);
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            layoutParams2.height = this.u + ((rawY - this.t) * (z ? 1 : -1));
            this.v = false;
            int height = this.j.getHeight();
            int height2 = ((View) this.k.getParent()).getHeight() - this.k.getHeight();
            int height3 = ((View) this.k.getParent()).getHeight();
            int d = d(50);
            if (z && layoutParams2.height + d > height2) {
                layoutParams2.height = height2 - d;
            }
            if (!z && layoutParams2.height > (i = (height3 - height) - d)) {
                layoutParams2.height = i;
            }
            int d2 = d(20);
            if (layoutParams2.height < d2) {
                layoutParams2.height = d2;
            }
            int i2 = this.w;
            if (i2 > 0) {
                int i3 = i2 != 2 ? 5 : 50;
                int scrollY = this.i.getScrollY();
                int d3 = d(15);
                if (z && Math.abs(height - scrollY) < d3) {
                    this.i.smoothScrollBy(0, d(-i3));
                }
                if (!z && Math.abs((this.i.getHeight() + scrollY) - height2) < d3) {
                    this.i.smoothScrollBy(0, d(i3));
                }
            }
            view2.setLayoutParams(layoutParams2);
        }
        return true;
    }
}
