package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SP1 {
    public final Bundle a;
    public ArrayList b;
    public ArrayList c;

    public SP1(String str, String str2) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (str == null) {
            throw new NullPointerException("id must not be null");
        }
        bundle.putString("id", str);
        if (str2 == null) {
            throw new NullPointerException("name must not be null");
        }
        bundle.putString("name", str2);
    }

    public final void a(List list) {
        if (list == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                if (this.c == null) {
                    this.c = new ArrayList();
                }
                if (!this.c.contains(intentFilter)) {
                    this.c.add(intentFilter);
                }
            }
        }
    }

    public final TP1 b() {
        ArrayList<? extends Parcelable> arrayList = this.c;
        Bundle bundle = this.a;
        if (arrayList != null) {
            bundle.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList<String> arrayList2 = this.b;
        if (arrayList2 != null) {
            bundle.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new TP1(bundle);
    }
}
