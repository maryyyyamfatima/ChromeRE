package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fx */
/* loaded from: classes2.dex */
public abstract class AbstractC5426fx implements InterfaceC5451g12 {
    public final C7857n12 a;
    public final int g;
    public EC h;
    public C5082ex i;
    public View j;
    public String k;

    @Override // defpackage.InterfaceC5451g12
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.InterfaceC5451g12
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // defpackage.InterfaceC5451g12
    public final int m(int i) {
        return i;
    }

    @Override // defpackage.InterfaceC5451g12
    public final float o(float f) {
        return f;
    }

    @Override // defpackage.InterfaceC5451g12
    public final int p(int i) {
        return i;
    }

    @Override // defpackage.InterfaceC5451g12
    public final /* synthetic */ void s() {
    }

    public AbstractC5426fx(C7857n12 c7857n12) {
        this.a = c7857n12;
        this.g = AbstractC11746yN.b(c7857n12.a(), false);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ex] */
    public final void d(ViewGroup viewGroup) {
        this.j = viewGroup;
        this.i = new Callback() { // from class: ex
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Rect rect = (Rect) obj;
                AbstractC5426fx abstractC5426fx = AbstractC5426fx.this;
                abstractC5426fx.getClass();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                int i = rect.left;
                layoutParams.setMargins(i, rect.top, i, rect.bottom);
                abstractC5426fx.j.setLayoutParams(layoutParams);
            }
        };
        EC ec = new EC(this.a.b);
        this.h = ec;
        ec.m(this.i);
        Object obj = this.h.g;
        if (obj != null) {
            Rect rect = (Rect) obj;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i = rect.left;
            layoutParams.setMargins(i, rect.top, i, rect.bottom);
            this.j.setLayoutParams(layoutParams);
        }
    }

    @Override // defpackage.InterfaceC5451g12
    public final View a() {
        return this.j;
    }

    @Override // defpackage.InterfaceC5451g12
    public String getUrl() {
        return this.k;
    }

    @Override // defpackage.InterfaceC5451g12
    public int t() {
        return this.g;
    }

    @Override // defpackage.InterfaceC5451g12
    public void n(String str) {
        this.k = str;
    }

    @Override // defpackage.InterfaceC5451g12
    public void destroy() {
        EC ec = this.h;
        if (ec != null) {
            ec.n(this.i);
            EC ec2 = this.h;
            ((CC) ec2.i).g(ec2);
        }
    }
}
