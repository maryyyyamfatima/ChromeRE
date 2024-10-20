package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kp4 */
/* loaded from: classes.dex */
public final class C7101kp4 extends AbstractC7723me4 {
    public final /* synthetic */ C8477op4 a;

    public C7101kp4(C8477op4 c8477op4) {
        this.a = c8477op4;
    }

    @Override // defpackage.InterfaceC7379le4
    public final void a() {
        View view;
        C8477op4 c8477op4 = this.a;
        if (c8477op4.p && (view = c8477op4.g) != null) {
            view.setTranslationY(0.0f);
            c8477op4.d.setTranslationY(0.0f);
        }
        c8477op4.d.setVisibility(8);
        ActionBarContainer actionBarContainer = c8477op4.d;
        actionBarContainer.a = false;
        actionBarContainer.setDescendantFocusability(262144);
        c8477op4.t = null;
        InterfaceC5816h5 interfaceC5816h5 = c8477op4.k;
        if (interfaceC5816h5 != null) {
            interfaceC5816h5.b(c8477op4.j);
            c8477op4.j = null;
            c8477op4.k = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = c8477op4.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = Ec4.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }
}
