package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class N40 extends AbstractC0185Bl {
    public static final String[] n = {"_id", "lookup", "display_name"};
    public final ContentResolver h;
    public final M40 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (h()) {
            return;
        }
        ((AbstractC6099hu2) this.i).M(arrayList);
    }

    public N40(Context context, C5233fP c5233fP, boolean z, boolean z2, boolean z3, boolean z4) {
        this.h = context.getContentResolver();
        this.i = c5233fP;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Map] */
    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        boolean z;
        HashMap hashMap;
        boolean z2;
        HashMap hashMap2;
        HashMap hashMap3;
        List list;
        if (h()) {
            return null;
        }
        boolean z3 = this.k;
        HashMap n2 = z3 ? n(ContactsContract.CommonDataKinds.Email.CONTENT_URI) : null;
        boolean z4 = this.l;
        HashMap n3 = z4 ? n(ContactsContract.CommonDataKinds.Phone.CONTENT_URI) : null;
        boolean z5 = this.m;
        if (z5) {
            hashMap2 = new HashMap();
            Cursor query = this.h.query(ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, null, null, null, "contact_id ASC, data1 ASC");
            ArrayList arrayList = new ArrayList();
            String str = "";
            while (query.moveToNext()) {
                String string = query.getString(query.getColumnIndexOrThrow("contact_id"));
                String string2 = query.getString(query.getColumnIndexOrThrow("data7"));
                String string3 = query.getString(query.getColumnIndexOrThrow("data10"));
                String string4 = query.getString(query.getColumnIndexOrThrow("data1"));
                String string5 = query.getString(query.getColumnIndexOrThrow("data9"));
                boolean z6 = z5;
                String string6 = query.getString(query.getColumnIndexOrThrow("data8"));
                HashMap hashMap4 = n3;
                boolean z7 = z4;
                C4687do2 c4687do2 = new C4687do2(0);
                if (string2 == null) {
                    string2 = "";
                }
                c4687do2.e = string2;
                if (string3 == null) {
                    string3 = "";
                }
                c4687do2.b = string3;
                c4687do2.c = string4 != null ? new String[]{string4} : new String[0];
                if (string5 == null) {
                    string5 = "";
                }
                c4687do2.g = string5;
                if (string6 == null) {
                    string6 = "";
                }
                c4687do2.d = string6;
                c4687do2.f = "";
                c4687do2.h = "";
                c4687do2.i = "";
                c4687do2.j = "";
                c4687do2.k = "";
                if (str.isEmpty()) {
                    arrayList.add(c4687do2);
                } else if (str.equals(string)) {
                    arrayList.add(c4687do2);
                    z5 = z6;
                    n3 = hashMap4;
                    z4 = z7;
                } else {
                    hashMap2.put(str, arrayList);
                    arrayList = new ArrayList();
                    arrayList.add(c4687do2);
                }
                str = string;
                z5 = z6;
                n3 = hashMap4;
                z4 = z7;
            }
            z = z4;
            hashMap = n3;
            z2 = z5;
            hashMap2.put(str, arrayList);
            query.close();
        } else {
            z = z4;
            hashMap = n3;
            z2 = z5;
            hashMap2 = null;
        }
        Cursor query2 = this.h.query(ContactsContract.Contacts.CONTENT_URI, n, null, null, "sort_key ASC");
        if (!query2.moveToFirst()) {
            query2.close();
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList(query2.getCount());
        while (true) {
            String string7 = query2.getString(query2.getColumnIndexOrThrow("_id"));
            String string8 = query2.getString(query2.getColumnIndexOrThrow("display_name"));
            List list2 = z3 ? (List) n2.get(string7) : null;
            if (z) {
                ?? r5 = hashMap;
                list = (List) r5.get(string7);
                hashMap3 = r5;
            } else {
                hashMap3 = hashMap;
                list = null;
            }
            List list3 = z2 ? (List) hashMap2.get(string7) : null;
            if (this.j || list2 != null || list != null || list3 != null) {
                arrayList2.add(new A40(string7, string8, list2, list, list3));
            }
            if (!query2.moveToNext()) {
                query2.close();
                return arrayList2;
            }
            hashMap = hashMap3;
        }
    }

    public final HashMap n(Uri uri) {
        HashMap hashMap = new HashMap();
        Cursor query = this.h.query(uri, null, null, null, "contact_id ASC, data1 ASC");
        ArrayList arrayList = new ArrayList();
        String str = "";
        while (query.moveToNext()) {
            String string = query.getString(query.getColumnIndexOrThrow("contact_id"));
            String string2 = query.getString(query.getColumnIndexOrThrow("data1"));
            if (string2 == null) {
                string2 = "";
            }
            if (str.isEmpty()) {
                arrayList.add(string2);
            } else if (str.equals(string)) {
                arrayList.add(string2);
            } else {
                hashMap.put(str, arrayList);
                arrayList = new ArrayList();
                arrayList.add(string2);
            }
            str = string;
        }
        hashMap.put(str, arrayList);
        query.close();
        return hashMap;
    }
}
