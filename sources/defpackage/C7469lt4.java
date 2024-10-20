package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7469lt4 extends AbstractRunnableC9872st4 {
    public final /* synthetic */ List g;
    public final /* synthetic */ Vv4 h;
    public final /* synthetic */ St4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7469lt4(St4 st4, Vv4 vv4, List list, Vv4 vv42) {
        super(vv4);
        this.i = st4;
        this.g = list;
        this.h = vv42;
    }

    @Override // defpackage.AbstractRunnableC9872st4
    public final void a() {
        Vv4 vv4 = this.h;
        List list = this.g;
        St4 st4 = this.i;
        try {
            Gu4 gu4 = (Gu4) st4.b.k;
            String str = st4.a;
            ArrayList a = St4.a(list);
            Bundle bundle = new Bundle();
            bundle.putInt("playcore_version_code", 11000);
            BinderC11930yt4 binderC11930yt4 = new BinderC11930yt4(st4, vv4);
            Du4 du4 = (Du4) gu4;
            du4.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            obtain.writeString(str);
            obtain.writeTypedList(a);
            int i = AbstractC8175nw4.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(binderC11930yt4);
            try {
                du4.a.transact(8, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            St4.c.a("deferredInstall(%s)", e, list);
            vv4.a(new RuntimeException(e));
        }
    }
}
