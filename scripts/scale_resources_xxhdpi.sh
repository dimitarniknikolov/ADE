# add desired categories                                                                                                                                                                                                                                                  
CATEGORIES=ldpi,mdpi,tvdpi,hdpi,xhdpi
# categories scale in % based on xhdpi                                                                                                                                                                                                                                    
CATEGORIES_SCALE=37.5,50,66.5,75,100                                                                                                                                                                                                                                               

IFS=',' read -a densities <<< "$CATEGORIES"                                                                                                                                                                                                                               
IFS=',' read -a scales <<< "$CATEGORIES_SCALE"                                                                                                                                                                                                                            
FILTER=$1*.png                                                                                                                                                                                                                                                            

for index in "${!densities[@]}"                                                                                                                                                                                                                                           
do                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                          
    echo processig ${densities[index]} resources...                                                                                                                                                                                                                       
    if [ ! -d "res/drawable-${densities[index]}" ]; then                                                                                                                                                                                                                  

    fi

    for i in res/drawable-xxhdpi/$FILTER; do
                convert $i -resize ${scales[index]}% res/drawable-${densities[index]}/${i##*/}
    done

done