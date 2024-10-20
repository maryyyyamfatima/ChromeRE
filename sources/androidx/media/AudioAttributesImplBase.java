package androidx.media;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC9076qb1;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.b != audioAttributesImplBase.b) {
            return false;
        }
        int i2 = this.c;
        int i3 = audioAttributesImplBase.c;
        int i4 = audioAttributesImplBase.d;
        if (i4 == -1) {
            int i5 = audioAttributesImplBase.a;
            int i6 = AudioAttributesCompat.b;
            if ((i3 & 1) != 1) {
                i = 4;
                if ((i3 & 4) != 4) {
                    switch (i5) {
                        case 2:
                            i = 0;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            i = 8;
                            break;
                        case 4:
                            break;
                        case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i = 5;
                            break;
                        case 6:
                            i = 2;
                            break;
                        case 11:
                            i = 10;
                            break;
                        case 12:
                        default:
                            i = 3;
                            break;
                        case 13:
                            i = 1;
                            break;
                    }
                } else {
                    i = 6;
                }
            } else {
                i = 7;
            }
        } else {
            i = i4;
        }
        if (i == 6) {
            i3 |= 4;
        } else if (i == 7) {
            i3 |= 1;
        }
        return i2 == (i3 & 273) && this.a == audioAttributesImplBase.a && this.d == i4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.a;
        int i2 = AudioAttributesCompat.b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = AbstractC9076qb1.a("unknown usage ", i);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
