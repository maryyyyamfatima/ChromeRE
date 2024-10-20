package org.chromium.components.omnibox;

import android.text.style.ForegroundColorSpan;
import defpackage.InterfaceC10797vc2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class OmniboxUrlEmphasizer$UrlEmphasisColorSpan extends ForegroundColorSpan implements InterfaceC10797vc2 {
    public final int a;

    public OmniboxUrlEmphasizer$UrlEmphasisColorSpan(int i) {
        super(i);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OmniboxUrlEmphasizer$UrlEmphasisColorSpan) && ((OmniboxUrlEmphasizer$UrlEmphasisColorSpan) obj).a == this.a;
    }

    @Override // android.text.style.ForegroundColorSpan
    public final String toString() {
        return getClass().getName() + ", color: " + this.a;
    }
}
