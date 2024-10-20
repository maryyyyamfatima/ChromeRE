package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aT2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3538aT2 implements InterfaceC4912eT2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ C2149Qo b;

    public /* synthetic */ C3538aT2(long j, C2149Qo c2149Qo) {
        this.a = j;
        this.b = c2149Qo;
    }

    @Override // defpackage.InterfaceC4912eT2
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        C2149Qo c2149Qo = this.b;
        EnumC7223lA2 enumC7223lA2 = c2149Qo.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{c2149Qo.a, String.valueOf(AbstractC7911nA2.a(enumC7223lA2))}) < 1) {
            contentValues.put("backend_name", c2149Qo.a);
            contentValues.put("priority", Integer.valueOf(AbstractC7911nA2.a(enumC7223lA2)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
