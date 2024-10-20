package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7125kt4 extends AbstractRunnableC9872st4 {
    public final /* synthetic */ Collection g;
    public final /* synthetic */ Collection h;
    public final /* synthetic */ Vv4 i;
    public final /* synthetic */ St4 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7125kt4(St4 st4, Vv4 vv4, ArrayList arrayList, ArrayList arrayList2, Vv4 vv42) {
        super(vv4);
        this.j = st4;
        this.g = arrayList;
        this.h = arrayList2;
        this.i = vv42;
    }

    @Override // defpackage.AbstractRunnableC9872st4
    public final void a() {
        Vv4 vv4 = this.i;
        St4 st4 = this.j;
        Collection collection = this.g;
        ArrayList a = St4.a(collection);
        Collection collection2 = this.h;
        a.addAll(St4.b(collection2));
        try {
            Gu4 gu4 = (Gu4) st4.b.k;
            String str = st4.a;
            Bundle bundle = new Bundle();
            bundle.putInt("playcore_version_code", 11000);
            Mt4 mt4 = new Mt4(st4, vv4);
            Du4 du4 = (Du4) gu4;
            du4.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            obtain.writeString(str);
            obtain.writeTypedList(a);
            int i = AbstractC8175nw4.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(mt4);
            try {
                du4.a.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            St4.c.a("startInstall(%s,%s)", e, collection, collection2);
            vv4.a(new RuntimeException(e));
        }
    }
}
