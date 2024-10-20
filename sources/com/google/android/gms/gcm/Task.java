package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.AbstractC4500dF3;
import defpackage.AbstractC9076qb1;
import defpackage.XP2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Deprecated
/* loaded from: classes.dex */
public abstract class Task implements ReflectedParcelable {
    public final String a;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final Set k;
    public final boolean l;
    public final XP2 m;
    public final Bundle n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Task(AbstractC4500dF3 abstractC4500dF3) {
        this.a = abstractC4500dF3.b;
        this.g = abstractC4500dF3.c;
        this.h = abstractC4500dF3.d;
        this.i = abstractC4500dF3.e;
        this.j = abstractC4500dF3.a;
        this.k = abstractC4500dF3.g;
        this.l = abstractC4500dF3.f;
        this.n = abstractC4500dF3.i;
        XP2 xp2 = abstractC4500dF3.h;
        this.m = xp2 == null ? XP2.a : xp2;
    }

    public Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.a = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt() == 1;
        this.j = 2;
        this.k = Collections.emptySet();
        this.l = false;
        this.m = XP2.a;
        this.n = null;
    }

    public void a(Bundle bundle) {
        bundle.putString("tag", this.g);
        bundle.putBoolean("update_current", this.h);
        bundle.putBoolean("persisted", this.i);
        bundle.putString("service", this.a);
        bundle.putInt("requiredNetwork", this.j);
        Set set = this.k;
        if (!set.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((Uri) it.next()).toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.l);
        bundle.putBoolean("requiresIdle", false);
        Bundle bundle2 = new Bundle();
        this.m.getClass();
        bundle2.putInt("retry_policy", 0);
        bundle2.putInt("initial_backoff_seconds", 30);
        bundle2.putInt("maximum_backoff_seconds", 3600);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle("extras", this.n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }

    public static void c(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > 10240) {
                throw new IllegalArgumentException(AbstractC9076qb1.a("Extras exceeding maximum size(10240 bytes): ", dataSize));
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                if (!((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean))) {
                    if (obj instanceof Bundle) {
                        c((Bundle) obj);
                    } else {
                        throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                    }
                }
            }
        }
    }
}
