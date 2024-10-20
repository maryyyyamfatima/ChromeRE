package org.chromium.services.data_decoder;

import J.N;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.MalformedJsonException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC2663Um3;
import defpackage.AbstractC3216Yt1;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class JsonSanitizer {
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x002c. Please report as an issue. */
    public static String a(String str) {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        StringWriter stringWriter = new StringWriter(str.length());
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                switch (AbstractC3216Yt1.a[jsonReader.peek().ordinal()]) {
                    case 1:
                        i++;
                        if (i < 200) {
                            jsonReader.beginArray();
                            jsonWriter.beginArray();
                        } else {
                            throw new IllegalStateException("Too much nesting");
                        }
                    case 2:
                        i--;
                        jsonReader.endArray();
                        jsonWriter.endArray();
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        i++;
                        if (i < 200) {
                            jsonReader.beginObject();
                            jsonWriter.beginObject();
                        } else {
                            throw new IllegalStateException("Too much nesting");
                        }
                    case 4:
                        i--;
                        jsonReader.endObject();
                        jsonWriter.endObject();
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        String nextName = jsonReader.nextName();
                        b(nextName);
                        jsonWriter.name(nextName);
                    case 6:
                        String nextString = jsonReader.nextString();
                        b(nextString);
                        jsonWriter.value(nextString);
                    case 7:
                        String nextString2 = jsonReader.nextString();
                        try {
                            jsonWriter.value(Long.parseLong(nextString2));
                        } catch (NumberFormatException unused) {
                            jsonWriter.value(Double.parseDouble(nextString2));
                        }
                    case 8:
                        jsonWriter.value(jsonReader.nextBoolean());
                    case 9:
                        jsonReader.nextNull();
                        jsonWriter.nullValue();
                    case 10:
                        z = true;
                }
            } finally {
                AbstractC2663Um3.a(jsonReader);
                AbstractC2663Um3.a(jsonWriter);
            }
        }
        return stringWriter.toString();
    }

    public static void sanitize(long j, String str) {
        try {
            N.MkUGEqr$(j, a(str));
        } catch (IOException | IllegalStateException e) {
            N.MOkhqs8N(j, e.getMessage());
        }
    }

    public static void b(String str) {
        int length = str.length();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            char charAt = str.charAt(i);
            if (Character.isLowSurrogate(charAt)) {
                break;
            }
            if (Character.isHighSurrogate(charAt)) {
                i++;
                if (i >= length) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if (!Character.isLowSurrogate(charAt2)) {
                    break;
                } else {
                    Character.toCodePoint(charAt, charAt2);
                }
            }
            i++;
        }
        if (!z) {
            throw new MalformedJsonException("Invalid escape sequence");
        }
    }
}
