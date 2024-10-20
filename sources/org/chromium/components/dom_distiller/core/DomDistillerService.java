package org.chromium.components.dom_distiller.core;

import J.N;
import defpackage.C9165qq0;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class DomDistillerService {
    public final C9165qq0 a;

    public DomDistillerService(long j) {
        this.a = new C9165qq0(N.MzVEzhvu(j));
    }

    public static DomDistillerService create(long j) {
        Object obj = ThreadUtils.a;
        return new DomDistillerService(j);
    }
}
