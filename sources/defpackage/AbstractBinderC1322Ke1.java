package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ke1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1322Ke1 extends AbstractBinderC7826mw {
    public AbstractBinderC1322Ke1() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status, null, ((BinderC4031bt2) this).a);
                return true;
            case 2:
                Status status2 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status2, null, ((BinderC4031bt2) this).a);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                Status status3 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status3, null, ((BinderC4031bt2) this).a);
                return true;
            case 4:
                Status status4 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                Configurations configurations = (Configurations) AbstractC11786yV.a(parcel, Configurations.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status4, configurations, ((BinderC4031bt2) this).a);
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                Status status5 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status5, null, ((BinderC4031bt2) this).a);
                return true;
            case 6:
                Status status6 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                ExperimentTokens experimentTokens = (ExperimentTokens) AbstractC11786yV.a(parcel, ExperimentTokens.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status6, experimentTokens, ((BinderC4031bt2) this).a);
                return true;
            case 7:
                Status status7 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                DogfoodsToken dogfoodsToken = (DogfoodsToken) AbstractC11786yV.a(parcel, DogfoodsToken.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status7, dogfoodsToken, ((BinderC4031bt2) this).a);
                return true;
            case 8:
                Status status8 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status8, null, ((BinderC4031bt2) this).a);
                return true;
            case 9:
                Status status9 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                Flag flag = (Flag) AbstractC11786yV.a(parcel, Flag.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status9, flag, ((BinderC4031bt2) this).a);
                return true;
            case 10:
                Status status10 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                Configurations configurations2 = (Configurations) AbstractC11786yV.a(parcel, Configurations.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status10, configurations2, ((BinderC4031bt2) this).a);
                return true;
            case 11:
                Status status11 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                long readLong = parcel.readLong();
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status11, Long.valueOf(readLong), ((BinderC4031bt2) this).a);
                return true;
            case 12:
                Status status12 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status12, null, ((BinderC4031bt2) this).a);
                return true;
            case 13:
                Status status13 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                FlagOverrides flagOverrides = (FlagOverrides) AbstractC11786yV.a(parcel, FlagOverrides.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status13, flagOverrides, ((BinderC4031bt2) this).a);
                return true;
            case 14:
                Status status14 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status14, null, ((BinderC4031bt2) this).a);
                return true;
            case 15:
                Status status15 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status15, null, ((BinderC4031bt2) this).a);
                return true;
            case 16:
                Status status16 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                long readLong2 = parcel.readLong();
                AbstractBinderC7826mw.g1(parcel);
                RF3.a(status16, Long.valueOf(readLong2), ((BinderC4031bt2) this).a);
                return true;
            default:
                return false;
        }
    }
}
