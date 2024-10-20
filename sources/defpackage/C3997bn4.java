package defpackage;

import android.util.JsonWriter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bn4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3997bn4 {
    public final String a;
    public final String b;

    public C3997bn4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void a(JsonWriter jsonWriter) {
        jsonWriter.beginObject();
        jsonWriter.name("currency").value(this.a);
        jsonWriter.name("value").value(this.b);
        jsonWriter.endObject();
    }
}
