package defpackage;

import android.view.View;
import android.view.ViewStub;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4324cl0 implements InterfaceC8411oe4 {
    public final ViewStub a;
    public final MC2 b = new MC2();

    public C4324cl0(ViewStub viewStub) {
        this.a = viewStub;
        viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: bl0
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub2, View view) {
                C4324cl0.this.b.b(view);
            }
        });
    }

    @Override // defpackage.InterfaceC8411oe4
    public final void b() {
        this.a.inflate();
    }

    @Override // defpackage.InterfaceC8411oe4
    public final void a(Callback callback) {
        MC2 mc2 = this.b;
        if (mc2.d()) {
            callback.onResult((View) mc2.b);
        } else {
            mc2.g(callback);
        }
    }
}
