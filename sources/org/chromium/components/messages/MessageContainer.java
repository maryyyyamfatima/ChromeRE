package org.chromium.components.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.C5792h1;
import defpackage.Ec4;
import defpackage.InterfaceC3891bV1;
import defpackage.S1;
import defpackage.ZU1;
import org.chromium.base.TraceEvent;
import org.chromium.components.messages.MessageContainer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MessageContainer extends FrameLayout {
    public View a;
    public InterfaceC3891bV1 g;

    public MessageContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAccessibilityDelegate(new ZU1(this));
        Ec4.k(this, C5792h1.w, new S1() { // from class: YU1
            @Override // defpackage.S1
            public final boolean a(View view) {
                InterfaceC3891bV1 interfaceC3891bV1 = MessageContainer.this.g;
                if (interfaceC3891bV1 == null) {
                    return false;
                }
                C9426rc3 c9426rc3 = (C9426rc3) interfaceC3891bV1;
                c9426rc3.e.a(4, c9426rc3.d);
                return true;
            }
        });
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        TraceEvent i = TraceEvent.i("MessageContainer.setLayoutParams", null);
        try {
            super.setLayoutParams(layoutParams);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
