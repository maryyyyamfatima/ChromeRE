package defpackage;

import android.util.JsonWriter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cn4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4340cn4 {
    public final C4684dn4 a;
    public final C5027en4 b;

    public C4340cn4(C4684dn4 c4684dn4, C5027en4 c5027en4) {
        this.a = c4684dn4;
        this.b = c5027en4;
    }

    public final void a(JsonWriter jsonWriter) {
        jsonWriter.beginObject();
        C4684dn4 c4684dn4 = this.a;
        if (c4684dn4 != null) {
            jsonWriter.name("total");
            jsonWriter.beginObject();
            jsonWriter.name("label").value("");
            jsonWriter.name("amount");
            c4684dn4.a.a(jsonWriter);
            jsonWriter.endObject();
        } else {
            jsonWriter.name("total").nullValue();
        }
        jsonWriter.name("supportedMethods").beginArray();
        C5027en4 c5027en4 = this.b;
        jsonWriter.value(c5027en4.a);
        jsonWriter.endArray();
        jsonWriter.name("data").value(c5027en4.b);
        jsonWriter.endObject();
    }
}
