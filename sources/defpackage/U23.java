package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import java.util.ArrayList;
import org.chromium.ui.widget.ViewLookupCachingFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class U23 extends ViewLookupCachingFrameLayout implements Checkable, View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, InterfaceC7182l33 {
    public C7526m33 h;
    public Object i;
    public Boolean j;
    public boolean k;
    public float l;
    public float m;

    public abstract void j();

    public void o(boolean z) {
    }

    public U23(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = true;
    }

    public final void m(C7526m33 c7526m33) {
        C7526m33 c7526m332 = this.h;
        if (c7526m332 != c7526m33) {
            if (c7526m332 != null) {
                c7526m332.d.d(this);
            }
            this.h = c7526m33;
            c7526m33.a(this);
        }
    }

    public void k(Object obj) {
        this.i = obj;
        setChecked(this.h.d(obj));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnTouchListener(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
        setAccessibilityDelegate(new T23(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7526m33 c7526m33 = this.h;
        if (c7526m33 != null) {
            setChecked(c7526m33.d(this.i));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChecked(false);
        this.j = null;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            this.m = x;
            this.l = x;
            return false;
        }
        if (actionMasked != 2) {
            return false;
        }
        this.m = motionEvent.getX();
        return false;
    }

    public void onClick(View view) {
        if (!this.k) {
            f();
        } else if (this.h.e()) {
            onLongClick(view);
        } else {
            j();
        }
    }

    public boolean onLongClick(View view) {
        if (Math.abs(this.m - this.l) >= 100.0f) {
            return true;
        }
        f();
        return true;
    }

    public final void f() {
        setChecked(n(this.i));
    }

    public boolean n(Object obj) {
        return this.h.g(obj);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        Boolean bool = this.j;
        return bool != null && bool.booleanValue();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        Boolean bool = this.j;
        if (bool == null || z != bool.booleanValue()) {
            boolean z2 = this.j != null;
            this.j = Boolean.valueOf(z);
            o(z2);
        }
    }

    public void d(ArrayList arrayList) {
        setChecked(this.h.d(this.i));
    }
}
