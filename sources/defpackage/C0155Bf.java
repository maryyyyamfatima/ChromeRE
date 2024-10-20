package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155Bf extends ContentFrameLayout {
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155Bf(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef, R60 r60) {
        super(r60, null);
        this.n = layoutInflaterFactory2C0545Ef;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.n.u(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = this.n;
                layoutInflaterFactory2C0545Ef.s(layoutInflaterFactory2C0545Ef.z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC2884Wf.a(getContext(), i));
    }
}
