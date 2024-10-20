package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dX3 */
/* loaded from: classes.dex */
public final class C4590dX3 {
    public static volatile C1196Jf0 b;
    public final J24 a;

    public C4590dX3(InterfaceC4919eV interfaceC4919eV, InterfaceC4919eV interfaceC4919eV2, InterfaceC10765vW2 interfaceC10765vW2, J24 j24, final Gq4 gq4) {
        this.a = j24;
        gq4.getClass();
        gq4.a.execute(new Runnable() { // from class: Eq4
            @Override // java.lang.Runnable
            public final void run() {
                final Gq4 gq42 = Gq4.this;
                gq42.getClass();
                ((C5600gT2) gq42.d).f(new InterfaceC2698Ut3() { // from class: Fq4
                    @Override // defpackage.InterfaceC2698Ut3
                    public final Object a() {
                        Gq4 gq43 = Gq4.this;
                        SQLiteDatabase b2 = ((C5600gT2) gq43.b).b();
                        b2.beginTransaction();
                        try {
                            List list = (List) C5600gT2.i(b2.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new InterfaceC4912eT2() { // from class: cT2
                                @Override // defpackage.InterfaceC4912eT2
                                public final Object apply(Object obj) {
                                    Cursor cursor = (Cursor) obj;
                                    ArrayList arrayList = new ArrayList();
                                    while (cursor.moveToNext()) {
                                        C2019Po c2019Po = new C2019Po();
                                        c2019Po.c(EnumC7223lA2.DEFAULT);
                                        c2019Po.b(cursor.getString(1));
                                        c2019Po.c(AbstractC7911nA2.b(cursor.getInt(2)));
                                        String string = cursor.getString(3);
                                        c2019Po.b = string == null ? null : Base64.decode(string, 0);
                                        arrayList.add(c2019Po.a());
                                    }
                                    return arrayList;
                                }
                            });
                            b2.setTransactionSuccessful();
                            b2.endTransaction();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((C11927yt1) gq43.c).a((C2149Qo) it.next(), 1, false);
                            }
                            return null;
                        } catch (Throwable th) {
                            b2.endTransaction();
                            throw th;
                        }
                    }
                });
            }
        });
    }
}
