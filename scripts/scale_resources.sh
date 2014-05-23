# add desired categories
CATEGORIES=ldpi,mdpi,hdpi
# categories scale in % based on xhdpi
CATEGORIES_SCALE=37.5,50,75

IFS=',' read -a densities <<< "$CATEGORIES"
IFS=',' read -a scales <<< "$CATEGORIES_SCALE"
FILTER=$1*.png

for index in "${!densities[@]}"
do
    
    echo processig ${densities[index]} resources...      
    if [ ! -d "res/drawable-${densities[index]}" ]; then 
		mkdir res/drawable-${densities[index]}
    fi

    for i in res/drawable-xhdpi/$FILTER; do
		convert $i -resize ${scales[index]}% res/drawable-${densities[index]}/${i##*/}
    done

done

