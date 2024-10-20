package org.chromium.chrome.browser.ui.tablet.emptybackground.incognitotoggle;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.AbstractC0962Hk1;
import defpackage.AbstractC11276wz3;
import defpackage.C1222Jk1;
import defpackage.InterfaceC10590uz3;
import defpackage.RunnableC1352Kk1;
import defpackage.ViewOnClickListenerC1092Ik1;
import java.util.Iterator;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class IncognitoToggleButtonTablet extends AbstractC0962Hk1 {
    public static final /* synthetic */ int l = 0;
    public C1222Jk1 k;

    public IncognitoToggleButtonTablet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.AbstractC0962Hk1, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
        setOnClickListener(new ViewOnClickListenerC1092Ik1(this));
    }

    public final void e() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.i;
        if (interfaceC10590uz3 == null || ((AbstractC11276wz3) interfaceC10590uz3).g() == null) {
            setVisibility(8);
        } else {
            post(new RunnableC1352Kk1(this));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.i;
        if (interfaceC10590uz3 != null) {
            ((AbstractC11276wz3) interfaceC10590uz3).c(this.j);
            Iterator it = ((AbstractC11276wz3) this.i).a.iterator();
            while (it.hasNext()) {
                ((TabModel) it.next()).g(this.k);
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.i;
        if (interfaceC10590uz3 != null) {
            ((AbstractC11276wz3) interfaceC10590uz3).s(this.j);
            Iterator it = ((AbstractC11276wz3) this.i).a.iterator();
            while (it.hasNext()) {
                ((TabModel) it.next()).i(this.k);
            }
        }
        super.onDetachedFromWindow();
    }
}
