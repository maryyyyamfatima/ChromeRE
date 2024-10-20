package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dT */
/* loaded from: classes.dex */
public final class C4566dT extends AbstractC5790h03 {
    public final ClearCorpusCall$Request q;

    @Override // defpackage.AbstractC8508ov
    public final void m(InterfaceC3129Yc interfaceC3129Yc) {
        EZ2 ez2 = (EZ2) interfaceC3129Yc;
        ez2.getClass();
        try {
            InterfaceC7726mf1 interfaceC7726mf1 = (InterfaceC7726mf1) ez2.m();
            FZ2 fz2 = new FZ2(this, ClearCorpusCall$Response.class);
            C7038kf1 c7038kf1 = (C7038kf1) interfaceC7726mf1;
            Parcel a = c7038kf1.a();
            AbstractC11786yV.b(a, this.q);
            AbstractC11786yV.c(a, fz2);
            c7038kf1.h(3, a);
        } catch (IllegalStateException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        }
    }

    public C4566dT(ClearCorpusCall$Request clearCorpusCall$Request, AbstractC10600v11 abstractC10600v11) {
        super(abstractC10600v11);
        this.q = clearCorpusCall$Request;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        ClearCorpusCall$Response clearCorpusCall$Response = new ClearCorpusCall$Response();
        clearCorpusCall$Response.a = status;
        return clearCorpusCall$Response;
    }
}
