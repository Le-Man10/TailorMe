import { Text, View } from "react-native";
import {Link} from "expo-router";

export default function Index() {
  return (
    <View className={"flex-1 justify-center items-center"}>
      <Text>Edit app/index.tsx to edit this scree.</Text>
        <Link href={"/onboard"}>onboarding</Link>
    </View>

  );
}
