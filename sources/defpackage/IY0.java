package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IY0 extends AbstractC5790h03 {
    public final GetCorpusStatusCall$Request q;

    @Override // defpackage.AbstractC8508ov
    public final void m(InterfaceC3129Yc interfaceC3129Yc) {
        EZ2 ez2 = (EZ2) interfaceC3129Yc;
        ez2.getClass();
        try {
            InterfaceC7726mf1 interfaceC7726mf1 = (InterfaceC7726mf1) ez2.m();
            FZ2 fz2 = new FZ2(this, GetCorpusStatusCall$Response.class);
            C7038kf1 c7038kf1 = (C7038kf1) interfaceC7726mf1;
            Parcel a = c7038kf1.a();
            AbstractC11786yV.b(a, this.q);
            AbstractC11786yV.c(a, fz2);
            c7038kf1.h(4, a);
        } catch (IllegalStateException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        }
    }

    public IY0(GetCorpusStatusCall$Request getCorpusStatusCall$Request, AbstractC10600v11 abstractC10600v11) {
        super(abstractC10600v11);
        this.q = getCorpusStatusCall$Request;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        GetCorpusStatusCall$Response getCorpusStatusCall$Response = new GetCorpusStatusCall$Response();
        getCorpusStatusCall$Response.a = status;
        return getCorpusStatusCall$Response;
    }
}
