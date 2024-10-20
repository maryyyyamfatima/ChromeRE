package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FZ2 extends AbstractBinderC7826mw {
    public final InterfaceC8851pv a;
    public final Class g;

    public FZ2(InterfaceC8851pv interfaceC8851pv, Class cls) {
        super("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
        this.a = interfaceC8851pv;
        this.g = cls;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC8851pv interfaceC8851pv = this.a;
        Class cls = this.g;
        switch (i) {
            case 2:
                RequestIndexingCall$Response requestIndexingCall$Response = (RequestIndexingCall$Response) AbstractC11786yV.a(parcel, RequestIndexingCall$Response.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                interfaceC8851pv.a(cls.cast(requestIndexingCall$Response));
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                ClearCorpusCall$Response clearCorpusCall$Response = (ClearCorpusCall$Response) AbstractC11786yV.a(parcel, ClearCorpusCall$Response.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                interfaceC8851pv.a(cls.cast(clearCorpusCall$Response));
                return true;
            case 4:
                GetCorpusStatusCall$Response getCorpusStatusCall$Response = (GetCorpusStatusCall$Response) AbstractC11786yV.a(parcel, GetCorpusStatusCall$Response.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                interfaceC8851pv.a(cls.cast(getCorpusStatusCall$Response));
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                GetCorpusInfoCall$Response getCorpusInfoCall$Response = (GetCorpusInfoCall$Response) AbstractC11786yV.a(parcel, GetCorpusInfoCall$Response.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                interfaceC8851pv.a(cls.cast(getCorpusInfoCall$Response));
                return true;
            case 6:
                DeleteUsageReportCall$Response deleteUsageReportCall$Response = (DeleteUsageReportCall$Response) AbstractC11786yV.a(parcel, DeleteUsageReportCall$Response.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                interfaceC8851pv.a(cls.cast(deleteUsageReportCall$Response));
                return true;
            case 7:
                RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response = (RegisterCorpusInfoCall$Response) AbstractC11786yV.a(parcel, RegisterCorpusInfoCall$Response.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                interfaceC8851pv.a(cls.cast(registerCorpusInfoCall$Response));
                return true;
            default:
                return false;
        }
    }
}
